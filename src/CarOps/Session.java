//Tony - Not Done
package CarOps;

import java.util.ArrayList;

public class Session {

    private String date;
    private int sessionID;
    private int folderID;
    private ArrayList<Session> sessions;

    public Session() {
        this.sessions = new ArrayList<>();
    }

    public Session(String date, int folderID) {
        this.date = date;
        this.folderID = folderID;
        this.sessions = new ArrayList<>();
        this.sessionID = this.sessions.size();
    }

    public ArrayList<Session> getSessions() { return this.sessions; }

    public void setSessions(ArrayList<Session> sessions) { this.sessions = sessions; }

    public void addSession(Session aSession) { 
        aSession.sessionID = this.sessions.size();
        this.sessions.add(aSession); 
    }

    public Session getSession(int folderID) {
        for(Session session: this.sessions){
            if(session.folderID == folderID){
                return session;
            }
        }
        return null;
    }

    public void edit(Session aSession, String date, int folderID) {
        int index = this.sessions.indexOf(aSession);
        if(index != -1){
            aSession.date = date;
            aSession.folderID = folderID;
            this.sessions.set(index, aSession);
        }
    }

    public void deleteSession(Session aSession) {
        this.sessions.remove(aSession);
    }
}

}
