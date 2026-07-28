class Solution {
    public int maxProduct(int n) {
        int[] digitsArray = new int[(int)Math.log10(n)+1];
        int i = 0;
        while(n > 0) {
            digitsArray[i] = n%10;
            n /= 10;
            i++;
        }
        Arrays.sort(digitsArray);
        return digitsArray[digitsArray.length - 1] * digitsArray[digitsArray.length - 2];
    }
}