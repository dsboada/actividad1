
package co.edu.poli.model;

public class PruebaBaseDeDatos {
    private String PasaporteId;
    private String FechaExp;
    private String TitularN;
    private String PaisN;
    private String CiudadN;
    private String VisaID;
    private int MulEnty;
    private String FecNac;

    // Constructor
    public PruebaBaseDeDatos(String pasaporteId, String fechaExp, String titularN, String paisN, String ciudadN, String visaID, int mulEnty, String fecNac) {
        this.PasaporteId = pasaporteId;
        this.FechaExp = fechaExp;
        this.TitularN = titularN;
        this.PaisN = paisN;
        this.CiudadN = ciudadN;
        this.VisaID = visaID;
        this.MulEnty = mulEnty;
        this.FecNac = fecNac;
    }

    // Getters y Setters
    public String getPasaporteID() { return PasaporteId; }
    public void setPasaporteID(String pasaporteID) { PasaporteId = pasaporteID; }

    public String getFechaExp() { return FechaExp; }
    public void setFechaExp(String fechaExp) { FechaExp = fechaExp; }

    public String getTitularN() { return TitularN; }
    public void setTitularN(String titularN) { TitularN = titularN; }

    public String getPaisN() { return PaisN; }
    public void setPaisN(String paisN) { PaisN = paisN; }

    public String getCiudadN() { return CiudadN; }
    public void setCiudadN(String ciudadN) { CiudadN = ciudadN; }

    public String getVisaID() { return VisaID; }
    public void setVisaID(String visaID) { VisaID = visaID; }

    public int getMulEnty() { return MulEnty; }
    public void setMulEnty(int mulEnty) { MulEnty = mulEnty; }

    public String getFecNac() { return FecNac; }
    public void setFecNac(String fecNac) { FecNac = fecNac; }

    public String toString() {
    return "Pasaporte {" +
            "PasaporteID='" + PasaporteId + '\'' +
            ", FechaExp='" + FechaExp + '\'' +
            ", TitularN='" + TitularN + '\'' +
            ", PaisN='" + PaisN + '\'' +
            ", CiudadN='" + CiudadN + '\'' +
            ", VisaID='" + VisaID + '\'' +
            ", MulEnty=" + MulEnty +
            ", FecNac='" + FecNac + '\'' +
            '}';
        }
    
}
