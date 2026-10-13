import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean exploded = false;
            
            while (!s.isEmpty() && s.peek() > 0 && asteroid < 0) {
                if (s.peek() < -asteroid) {
                    s.pop();
                    continue;
                } else if (s.peek() == -asteroid) {
                    s.pop();
                }
                exploded = true;
                break;
            }
            
            if (!exploded) {
                s.push(asteroid);
            }
        }
        
        int[] result = new int[s.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = s.pop();
        }
        
        return result;
    }
}