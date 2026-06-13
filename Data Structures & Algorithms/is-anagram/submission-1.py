class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1 = Solution.checkString(s)
        d2 = Solution.checkString(t)
        return d1 == d2


    def checkString(s: str) -> dict:        
        d1 = {}
        for i in range(len(s)):
            if s[i] in d1:
                d1[s[i]] += 1
            else:
                d1[s[i]] = 1
        return d1