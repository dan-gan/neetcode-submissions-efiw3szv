class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        total = {} ## empty total dict
        for i in range(0, len(strs)):
            current_dict = Solution.countChars(strs[i])
            current_tuple= tuple(sorted(current_dict.items()))
            if current_tuple in total:
                total[current_tuple] += [strs[i]]
            else:
                total[current_tuple] = [strs[i]]
        return list(total.values())

    def countChars(string: str) -> dict: ## caat -> {c: 1, a: 2, t: 1}
        chars_count = {} #empty dict
        for i in range(0, len(string)):
            if string[i] in chars_count:
                chars_count[string[i]] += 1
            else:
                chars_count[string[i]] = 1
        return chars_count