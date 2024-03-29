/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entités;

/**
 *
 * @author boussandel
 */

public class Evaluation {
    private int evaluationId;
    private int idUser ; 
    private int idEvenement ; 
    private double noteEvenement;
    private String nomParticipant;
    private String prenomParticipant ;
    private String emailParticipant;
    private String nomEvenement ; 

    public Evaluation(int idUser, int idEvenement, double noteEvenement, String nomParticipant, String prenomParticipant, String emailParticipant, String nomEvenement) {
        this.idUser = idUser;
        this.idEvenement = idEvenement;
        this.noteEvenement = noteEvenement;
        this.nomParticipant = nomParticipant;
        this.prenomParticipant = prenomParticipant;
        this.emailParticipant = emailParticipant;
        this.nomEvenement = nomEvenement;
    }

   
  
    

    public Evaluation(int evaluationId, int idUser, int idEvenement, double noteEvenement, String nomParticipant, String prenomParticipant, String emailParticipant, String nomEvenement) {
        this.evaluationId = evaluationId;
        this.idUser = idUser;
        this.idEvenement = idEvenement;
        this.noteEvenement = noteEvenement;
        this.nomParticipant = nomParticipant;
        this.prenomParticipant = prenomParticipant;
        this.emailParticipant = emailParticipant;
        this.nomEvenement = nomEvenement;
    }
    
    

    public Evaluation(int evaluationId, double noteEvenement, String nomPreParticipant, String prenomParticipant, String emailParticipant, String nomEvenement) {
        this.evaluationId = evaluationId;
        this.noteEvenement = noteEvenement;
        this.nomParticipant = nomPreParticipant;
        this.prenomParticipant = prenomParticipant;
        this.emailParticipant = emailParticipant;
        this.nomEvenement = nomEvenement;
    }
    

    public Evaluation(int evaluationId, double noteEvenement, String prenomParticipant, String nom_Participant) {
        this.evaluationId = evaluationId;
        this.noteEvenement = noteEvenement;
        this.nomParticipant = prenomParticipant;
        this.emailParticipant = nom_Participant;
    }

    public Evaluation(double noteEvenement, String prenomParticipant, String nom_Participant) {
        this.noteEvenement = noteEvenement;
        this.nomParticipant = prenomParticipant;
        this.emailParticipant = nom_Participant;
    }

    public Evaluation(double noteEvenement, String prenomParticipant, String nomParticipant, String nomEvenement) {
        this.noteEvenement = noteEvenement;
        this.nomParticipant = prenomParticipant;
        this.emailParticipant = nomParticipant;
        this.nomEvenement = nomEvenement;
    }

    public Evaluation(double noteEv, String email, String prenolEval, String nomEval, String nomEven) {
this.noteEvenement=noteEv ; 
this.emailParticipant=email ; 
this.prenomParticipant=prenolEval; 
this.nomParticipant=nomEval;
this.nomEvenement=nomEven;
        
        
        }

    public Evaluation() {
    }
 public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }
    public String getPrenomParticipant() {
        return prenomParticipant;
    }

    public void setPrenomParticipant(String prenomParticipant) {
        this.prenomParticipant = prenomParticipant;
    }

    
    public String getNomEvenement() {
        return nomEvenement;
    }

    public void setNomEvenement(String nomEvenement) {
        this.nomEvenement = nomEvenement;
    }
    

    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int evaluationId) {
        this.evaluationId = evaluationId;
    }

    public double getNoteEvenement() {
        return noteEvenement;
    }

    public void setNoteEvenement(double noteEvenement) {
        this.noteEvenement = noteEvenement;
    }

    public String getNomParticipant() {
        return nomParticipant;
    }

    public void setNomParticipant(String nomParticipant) {
        this.nomParticipant = nomParticipant;
    }

    public String getEmailParticipant() {
        return emailParticipant;
    }

    public void setEmailParticipant(String emailParticipant) {
        this.emailParticipant = emailParticipant;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "evaluationId=" + evaluationId + ", idUser=" + idUser + ", idEvenement=" + idEvenement + ", noteEvenement=" + noteEvenement + ", nomParticipant=" + nomParticipant + ", prenomParticipant=" + prenomParticipant + ", emailParticipant=" + emailParticipant + ", nomEvenement=" + nomEvenement + '}';
    }

    
    
    
}
