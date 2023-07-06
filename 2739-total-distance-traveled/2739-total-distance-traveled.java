class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int fuelMileagePerLiter = 10;
        int markerToAddReserves = 5;
        int litersConsumed = 0;
        int totalConsumedLiters = 0;

        if (mainTank >= 5) {
            while (mainTank >= 0) {
                mainTank--;
                litersConsumed++;
                totalConsumedLiters++;
                if (litersConsumed == markerToAddReserves && additionalTank >= 1) {
                    litersConsumed = 0;
                    mainTank++;
                    additionalTank--;
                    if (mainTank < 5) {
                        break;
                    }
                }
            }
            int sum = totalConsumedLiters + mainTank;
            return sum * fuelMileagePerLiter;
        }
        return mainTank * fuelMileagePerLiter;
    }
}