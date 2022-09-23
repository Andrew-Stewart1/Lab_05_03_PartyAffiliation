import java.util.Scanner;

public class PartyAffiliation {

    public PartyAffiliation() {
    }
    public static void main(String[] args) {
        String partyAffliation;
        System.out.println("Enter your party affiliation: [D/R/I]");
        partyAffliation = "R";

        if (partyAffliation.equalsIgnoreCase("D")){
            System.out.println("You are a Donkey!");
        } else if (partyAffliation.equalsIgnoreCase("R")){
            System.out.println("You are an elephant!");
        } else if (partyAffliation.equalsIgnoreCase("I")){
            System.out.println("You are a man!");
        }
        else{
            System.out.println("You are other!");
        }
    }



}