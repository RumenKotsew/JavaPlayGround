import java.util.Arrays;

public class GasStations {

    public static int getClosestGasStation(int tankSize, int[] gasStations, int closestGSindex) {
 
        for (int i = 0; i < gasStations.length; i++) {
            if (i != gasStations.length - 1) {
                if (tankSize >= gasStations[i] && tankSize <= gasStations[i + 1]) {
                    closestGSindex = i;
                    i = gasStations.length;
                }
            }
        }
        System.out.println(closestGSindex);
        return closestGSindex;
    }
     
    public static int[] refillTank(int[] gasStations, int closestGSindex, int[] gasStationsList) {
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

    public static int shortenTripDistance(int tripDistance, int[] gasStations, int closestGSindex) {
        tripDistance -= gasStations[closestGSindex];

        System.out.println(tripDistance);
        return tripDistance;
    }
     
    public static void main(String[] args) {
        int tripDistance = 400;
        int tankSize = 90;
        int[] gasStations = new int[] {50, 80, 130, 200, 260, 320, 370, 400};
        int closestGSindex = 0;
        int[] gasStationsList = new int[gasStations.length];
        boolean flag = true;

        for (int i = 0; i < gasStations.length; i++) {
            if (tripDistance < tankSize) {
                break;
            }
            if (gasStations[i] > 0) {
                closestGSindex = getClosestGasStation(tankSize, gasStations, closestGSindex);
                tripDistance = shortenTripDistance(tripDistance, gasStations, closestGSindex);
                if (tripDistance <= tankSize) {
                    for (int j = 0; j < gasStations.length; j++) {
                        if (gasStations[j] == 0) {
                            gasStations[j] = gasStations[gasStations.length - 1] - gasStations[j - 1];
                            flag = false;
                        }
                    }
                }
                if (flag == true) {
                    refillTank(gasStations, closestGSindex, gasStationsList);
                }            
            }
        }
    System.out.println(Arrays.toString(gasStationsList)); // out of main scope!
    
    }
}
