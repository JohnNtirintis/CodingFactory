package gr.aueb.cf.ch13.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ntirintis John
 */
public class Participant {
    private User user;
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarResponse> seminarResponses = new ArrayList<>();

    public Participant() {}

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    List<Seminar> getSeminars() {
        return seminars;
    }

    List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<SeminarResponse> getAllSeminarResponses() {
        return Collections.unmodifiableList(this.seminarResponses);
    }

    public List<SeminarResponse> getSeminarResponses() {
        return seminarResponses;
    }

    public void setSeminarResponses(List<SeminarResponse> seminarResponses) {
        this.seminarResponses = seminarResponses;
    }

    public boolean addSeminar(Seminar seminar){
        if (seminar == null) return false;

        for(Participant participant: seminar.getParticipants()){
            if(participant == this){
                return false;
            }
        }

        this.seminars.add(seminar);
        seminar.getParticipants().add(this);
        return true;
    }

    public boolean addSeminarInvitation(SeminarResponse seminarResponse){
        if (seminarResponse == null) return false;
        if (seminarResponse.getSender() == this) return false;

        this.seminarResponses.add(seminarResponse);
        seminarResponse.setSender(this);
        return true;
    }
}
