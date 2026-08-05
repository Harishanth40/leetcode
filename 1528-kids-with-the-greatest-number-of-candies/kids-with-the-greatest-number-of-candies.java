class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandey = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            result.add(i+extraCandies>=maxcandey);
        }
        return result;
    }
}