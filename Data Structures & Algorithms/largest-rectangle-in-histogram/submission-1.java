class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> height = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int area = 0;
        for (int i = 0; i < heights.length; i++){
            if (height.isEmpty()){
                height.push(heights[i]);
                index.push(i);
                continue;
            }
            int lastIndex = i;
            while (!height.isEmpty() && height.peek() > heights[i]){
                area = Math.max(area, (height.peek() * (i - index.peek())));
                lastIndex = index.pop();
                height.pop();
            }
            height.push(heights[i]);
            index.push(lastIndex);
        }
        for (int i = 0; i < height.size(); i++){
            area = Math.max(area, (height.get(i) * (heights.length - index.get(i))));
        }
        return area;
    }
}