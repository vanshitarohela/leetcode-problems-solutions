class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        i = 0
        j = 0
        arr = []
        n = len(nums1)
        m = len(nums2)
        while i<n and j<m:
            if nums1[i] < nums2[j]:
                arr.append(nums1[i])
                i+=1
            elif nums2[j] < nums1[i]:
                arr.append(nums2[j])
                j+=1
            else:
                arr.append(nums1[i])
                arr.append(nums2[j])
                i+=1
                j+=1
        if i == n:
            while j < m:
                arr.append(nums2[j])
                j+=1 
        elif j == m:
            while i < n:
                arr.append(nums1[i])
                i+=1 
        if (n+m)%2 == 1:
            return arr[(n+m)//2]
        return (arr[((n+m)//2)-1] + arr[(n+m)//2]) / 2