import java.util.Arrays;

public class GasStations {

    public static int getClosestGasStation(int tankSize, int[] gasStations) {
        int closestGSindex = 0;
 
        for (int i = 0; i < gasStations.length; i++) {
            if (tankSize >= gasStations[i] && i != gasStations.length - 1 && tankSize <= gasStations[i + 1]) {
                closestGSindex = i;
                i = gasStations.length;
            }
        }
        return closestGSindex;
    }
     
    public static int[] refillTank(int[] gasStations, int tripDistance, int closestGSindex, int[] gasStationsList) {
        tripDistance = tripDistance - gasStations[closestGSindex];
        int passedKilometers = gasStations[closestGSindex];
     
        for (int i = 0; i < gasStations.length; i++) {
            gasStations[i] = gasStations[i] - passedKilometers;
        }
     
        for (int j = 0; j < gasStationsList.length; j++) {
            if (gasStationsList[j] == 0) {
                gasStationsList[j] = passedKilometers;
                j = gasStationsList.length;
            }
        }
        return gasStationsList;
    }
     
    public static void main(String[] args) {
        int tripDistance = 400;
        int tankSize = 90;
        int[] gasStations = new int[] {50, 80, 130, 200, 260, 350};
        int closestGSindex = 0;
        int[] gasStationsList = new int[gasStations.length];
     
        for (int i = 0; i < gasStations.length; i++) {
            if (tripDistance < tankSize) {
                break;
            }
            if (gasStations[i] > 0) {
                closestGSindex = getClosestGasStation(tankSize, gasStations);
                refillTank(gasStations, tripDistance, closestGSindex, gasStationsList);
            }
        }
    System.out.println(Arrays.toString(gasStationsList));
    }
}