class Solution {
    public int countHousePlacements(int n) {
        long endingWithBuilding=1;
        long endingWithSpace=1;
        int mod=1000000007;
        for(int i=2;i<=n;i++){
           long newEndWithBuilding=endingWithSpace%mod;
            long newWndWithSpace=(endingWithSpace+endingWithBuilding)%mod;
            endingWithSpace=newWndWithSpace;
            endingWithBuilding=newEndWithBuilding;
        }
        long ans=(endingWithSpace%mod+endingWithBuilding%mod)%mod;
        return (int)(ans%mod*ans%mod)%mod;
        
    }
}