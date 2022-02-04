public class DivisibleByFive {
    public static int[] find(int[] aks) {
        if (aks.length < 2)
            return aks;
        int[] ans = new int[aks.length];
        int A = 0;
        int B = aks.length - 1;

        for (int i = 0; i < aks.length; i++) {
            if (aks[i] % 5 == 0)
                ans[B--] = aks[i];
            else

                ans[A++] = aks[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,13,15,18,20,25,32,40,53};
        int[] arr1= find(arr);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
