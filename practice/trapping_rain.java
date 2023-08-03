//package practice;

public class trapping_rain {

    public static int cal_rainwater(int nums[]){

        if(nums.length<=2){
            return 0;
        }
        // calculate left max boundary;

        int leftMax[]=new int[nums.length];
        leftMax[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            leftMax[i]=Math.max(nums[i],leftMax[i-1]);
        }
        //calculate right max boundary

        int rightMax[] = new int [nums.length];
        rightMax[nums.length-1]=nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            rightMax[i]= Math.max(nums[i], rightMax[i+1]);
        }
        int trap_water=0;

        for(int i=0;i<nums.length;i++){
            int bar_trap = Math.min(leftMax[i], rightMax[i]);

            trap_water += (bar_trap - nums[i]);  // trap_water = trap_water + (bar_trap - nums[i])


        }

        return trap_water;




    }
    public static void main(String args[]){
        int height[]={4,0,2,6,3,2,5};
        System.out.println(cal_rainwater(height));


    }
    
}
