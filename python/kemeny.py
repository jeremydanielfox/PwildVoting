import numpy as np
from itertools import combinations, permutations

def _build_ranks():
    return np.genfromtxt('choice_matrix.csv',delimiter=',')

def _get_labels():
    return open("labels.csv", "r").read().split(',')

def rankaggr_brute(ranks):
    min_dist = np.inf
    best_rank = None
    n_voters, n_candidates = ranks.shape
    for candidate_rank in permutations(range(n_candidates)):
        dist = np.sum(kendalltau_dist(candidate_rank, rank) for rank in ranks)
        if dist < min_dist:
            min_dist = dist
            best_rank = candidate_rank
    return min_dist, best_rank

def kendalltau_dist(rank_a, rank_b):
    tau = 0
    n_candidates = len(rank_a)
    for i, j in combinations(range(n_candidates), 2):
        tau += (np.sign(rank_a[i] - rank_a[j]) ==
                -np.sign(rank_b[i] - rank_b[j]))
    return tau

ranks = _build_ranks()
labels = _get_labels()
print labels
answer = rankaggr_brute(ranks)
print "dist: " + str(answer[0])
temp = []
for idx, x in enumerate(answer[1]):
    cur = (labels[idx],x)
    temp.append(cur)
outputs = sorted(temp, key = lambda val: val[1])
print outputs

