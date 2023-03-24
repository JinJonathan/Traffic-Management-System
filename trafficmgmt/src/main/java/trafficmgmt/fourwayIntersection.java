package trafficmgmt;
import java.util.ArrayList;

public class fourwayIntersection extends Intersection{ 

    // VARIABLES

    protected String intersectionRoadTwoName; 

    protected int currentLeftLightTimer; // Seconds left until the current green left light turns red (this variable counts down)

    protected int directionTwoLightLength; // Length in seconds that the directionTwo timer starts at once it turns green
    protected int directionOneLeftLightLength; // Length in seconds that the directionOne left light timer starts at once it turns green
    protected int directionTwoLeftLightLength; // Length in seconds that the directionTwo left light timer starts at once it turns green

    protected ArrayList<trafficlight> directionTwoTrafficLights;
    protected ArrayList<crosswalk> directionTwoCrosswalks;
  
    public abstract void changeTrafficLightTiming(direction direction, lightState light, int newLength);

    // CONSTRUCTOR

    public fourwayIntersection(int directionOneLightLength, int directionTwoLightLength, String intersectionRoadOneName, String intersectionRoadTwoName) {
        super(directionOneLightLength, intersectionRoadOneName);
        this.directionTwoLightLength = directionTwoLightLength;
        this.intersectionRoadTwoName = intersectionRoadTwoName;

        // ??????????????????????????????????????
        trafficlight firstDirectionTrafficlightOne = new trafficlight(direction.DIRECTION_ONE, directionOneLightLength);
        trafficlight firstDirectionTrafficlightTwo = new trafficlight(direction.DIRECTION_ONE, directionOneLightLength);
        directionOneTrafficLights.add(firstDirectionTrafficlightOne);
        directionOneTrafficLights.add(firstDirectionTrafficlightTwo);

        crosswalk firstDirectionCrosswalkOne = new crosswalk(direction.DIRECTION_ONE);
        crosswalk firstDirectionCrosswalkTwo = new crosswalk(direction.DIRECTION_ONE);
        directionOneCrosswalks.add(firstDirectionCrosswalkOne);
        directionOneCrosswalks.add(firstDirectionCrosswalkTwo);
        
        crosswalk secondDirectionCrosswalkOne = new crosswalk(direction.DIRECTION_TWO);
        crosswalk secondDirectionCrosswalkTwo = new crosswalk(direction.DIRECTION_TWO);
        directionOneCrosswalks.add(secondDirectionCrosswalkOne);
        directionOneCrosswalks.add(secondDirectionCrosswalkTwo);
    }


    // METHODS

    public int startIntersection() { 
        this.currentGreenLightDirection = direction.DIRECTION_ONE;
        
        for (trafficlight i : directionOneTrafficLights) {
            i.turnGreen();
        }
        for (crosswalk i : directionOneCrosswalks) { 
            i.walkSignal();
        }
        for (crosswalk i : directionTwoCrosswalks) {
            i.stopSignal();
        }
        return 1;
    };

    public int stopIntersection() { 
        
        for (trafficlight i : directionOneTrafficLights) {
            i.turnRed();
        }
        for (crosswalk i : directionOneCrosswalks) { 
            i.stopSignal();
        }
        for (crosswalk i : directionTwoCrosswalks) {
            i.stopSignal();
        }

        return 1;
    }
    public void changeTrafficLightTiming(direction direction, int newLength) { 

    }

    public void changeLeftTurnTiming(direction direction, int newLength) { 

    }

    public void changeCrossWalkTiming(direction direction, int newLength) { 

    }

    public int getTrafficLightTiming(direction direction) { 
        
        return 1;
    }

    public int getLeftTurnTiming(direction direction) { 

        return 1;
    }

    public int getCrossWalkTiming(direction direction) { 

        return 1;
    }

    public void shortenCurrentTrafficLightDuration(int timeToShortenBy) { 

    }

    public void shortenCurrentCrossWalkDuration(int timeToShortenBy) { 

    }

    public void pedestrianInput(direction requestedCrossingDirection) { 

    }

    public void carWeightInput(direction startDirection, direction crossingDirection, int weight) { 

    }

    public int inputOptimization() { 

        return 1;
    }

    public String viewOptimization() { 

        return "success";
    }

    public int applyOptimization() {

        return 1;
    }
    
}


