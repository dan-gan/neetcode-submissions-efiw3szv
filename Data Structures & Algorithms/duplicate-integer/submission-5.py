class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        mySet = set()
        for i in range(0, len(nums)):
            if nums[i] in mySet:
                return True
            else:
                mySet.add(nums[i])
        # for i in range(0,len(nums)-1):
        #     start = i
        #     next = start + 1
        #     for y in range(start, len(nums)-1):
        #         if (nums[start] == nums[next]):
        #             return True
        #         next += 1
        return False


