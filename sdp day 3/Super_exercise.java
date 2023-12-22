// ShowYourTalentRegistration class
public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        // Creating instances of SingleEventRegistration and TeamEventRegistration
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent();

        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        team1.registerEvent();

        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent();
    }
}
// EventRegistration class
class EventRegistration {
    String name;
    String nameOfEvent;
    int registrationFee;

    public EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        System.out.println("Participant/Team Name: " + name);
        System.out.println("Event Name: " + nameOfEvent);
        System.out.println("Registration Fee: $" + registrationFee);
    }
}

// SingleEventRegistration class
class SingleEventRegistration extends EventRegistration {
    int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        if (nameOfEvent.equals("ShakeALeg")) {
            registrationFee = 100;
        } else if (nameOfEvent.equals("Sing&Win")) {
            registrationFee = 150;
        } else if (nameOfEvent.equals("PlayAway")) {
            registrationFee = 130;
        }

        System.out.println("Participant Number: " + participantNo);
        super.registerEvent();
    }
}

// TeamEventRegistration class
class TeamEventRegistration extends EventRegistration {
    int teamNo;
    int noOfParticipants;

    public TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        if (nameOfEvent.equals("ShakeALeg")) {
            registrationFee = 50 * noOfParticipants;
        } else if (nameOfEvent.equals("Sing&Win")) {
            registrationFee = 60 * noOfParticipants;
        } else if (nameOfEvent.equals("Actathon")) {
            registrationFee = 80 * noOfParticipants;
        } else if (nameOfEvent.equals("PlayAway")) {
            registrationFee = 100 * noOfParticipants;
        }

        System.out.println("Team Number: " + teamNo);
        super.registerEvent();
    }
}


