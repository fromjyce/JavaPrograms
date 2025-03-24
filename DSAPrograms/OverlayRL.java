public class OverlayRL {
    public static int getMinimumTeamSize(List<Integer> startTime, List<Integer> endTime) {
        // Get size once
        final int n = startTime.size();
        
        // Early return for empty input
        if (n == 0) return 0;
        
        // Pre-allocate arrays with exact size
        final int[] starts = new int[n];
        final int[] ends = new int[n];
        
        // Cache list values in arrays - single pass
        for (int i = 0; i < n; i++) {
            starts[i] = startTime.get(i);
            ends[i] = endTime.get(i);
        }
        
        int maxTeamSize = 0;
        
        // Outer loop - try each employee as central member
        for (int i = 0; i < n && maxTeamSize < n; i++) {
            // Cache values to avoid repeated array access
            final int s1 = starts[i];
            final int e1 = ends[i];
            int teamSize = 1;
            
            // Calculate remaining possible team members
            final int remaining = n - maxTeamSize - 1;
            
            // Check if it's possible to exceed current max
            if (remaining <= 0) break;
            
            // Inner loop - check overlaps with other employees
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                // Inline overlap check
                if (s1 <= ends[j] && starts[j] <= e1) {
                    teamSize++;
                    
                    // Early termination - can't beat current max
                    if (teamSize + (n - j - 1) <= maxTeamSize) {
                        break;
                    }
                }
            }
            
            // Update max if better
            maxTeamSize = Math.max(maxTeamSize, teamSize);
        }
        
        return maxTeamSize;
    }
    
}