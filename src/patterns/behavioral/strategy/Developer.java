package patterns.behavioral.strategy;

import patterns.behavioral.state.Activity;
import patterns.behavioral.state.Coding;
import patterns.behavioral.state.Reading;
import patterns.behavioral.state.Sleeping;
import patterns.behavioral.state.Training;

public class Developer {
    patterns.behavioral.state.Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity(){
        activity.justDoIt();
    }
}
