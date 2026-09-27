class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        frequency = {}
        for num in nums:
            frequency[num] = frequency.get(num, 0) + 1
        sorted_items = sorted(
            frequency.items(),
            key=lambda x: x[1],
            reverse=True
        )
        return [item[0] for item in sorted_items[:k]]