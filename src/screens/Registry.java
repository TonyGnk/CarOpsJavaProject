package screens;
import java.util.ArrayList;

public class Registry {
    ArrayList<Session> Sessions = new ArrayList<Session>();
    //public ArrayList<Session> getSessions() { return Sessions; }
    //public void setSessions(ArrayList<Session> sessions) { Sessions = sessions; }
    public void addNewItem(String name, String date, String plate) { Sessions.add(new Session(name, date, plate, Sessions.size())); }

}