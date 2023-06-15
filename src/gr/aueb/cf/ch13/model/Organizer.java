package gr.aueb.cf.ch13.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Ntirintis John
 */
public class Organizer {
    private User user;
    private List<Seminar> seminars = new ArrayList<>();
    private List<SeminarInvitation> seminarInvitations = new ArrayList<>();

    public Organizer() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public List<Seminar> getAllSeminars() {
        return Collections.unmodifiableList(this.seminars);
    }

    public void setSeminars(List<Seminar> seminars) {
        this.seminars = seminars;
    }

    public List<SeminarInvitation> getSeminarInvitations() {
        return seminarInvitations;
    }

    public List<SeminarInvitation> getAllSeminarInvitations(){
        return Collections.unmodifiableList(this.seminarInvitations);
    }

    public void setSeminarInvitations(List<SeminarInvitation> seminarInvitations) {
        this.seminarInvitations = seminarInvitations;
    }

    public boolean AddSeminar(Seminar seminar){
        if (seminar == null) return false;
        if(seminar.getOrganizer() == this) return false;

        this.seminars.add(seminar);
        seminar.setOrganizer(this);
        return true;
    }
}
