import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class MeetingRoom {
    /*
        Input: intervals = [[0,30],[5,10],[15,20]]
        Output: false

        iterate through the sorted slots, compare if i.endTime and i+1.startTime overlaps.
    */
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

    }

    /*
        @param interval : is an array with all the meeting slots unordered.
        @return
    */

    public static  Boolean canAttendAll(Interval[] meetingSlots){

        //sort the meeting slots based on start time
        Arrays.sort(meetingSlots, (i1,i2) -> i1.start - i2.start);

        for(int i = 0; i < meetingSlots.length-1 ; i++){
            if (meetingSlots[i].start < meetingSlots[i+1].start){
                return  false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Interval intervals[] = new Interval[3];
        intervals[0] = new Interval(0,30);
        intervals[1] = new Interval(29,50);
        intervals[2] = new Interval(50,70);
        


        if(canAttendAll(intervals)){
            System.out.println("meetings can be attended.");
        }else{
            System.out.println("meetings can not be attended.");
        }

    }
}
