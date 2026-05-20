    set1 = set(nums1)
    set2 = set(nums2)

    return [list(set1.difference(set2)), list(set2.difference(set1))]