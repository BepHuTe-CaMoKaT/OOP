package patterns.structural.Facade;

public class Workflow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
