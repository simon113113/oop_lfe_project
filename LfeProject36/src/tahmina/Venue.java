/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tahmina;

/**
 *
 * @author Admin
 */
class Venue {
    private Integer Year;
    private String semester;
    private String Venue;

    public Venue(Integer Year, String semester, String Venue) {
        this.Year = Year;
        this.semester = semester;
        this.Venue = Venue;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer Year) {
        this.Year = Year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String Venue) {
        this.Venue = Venue;
    }
    
}
