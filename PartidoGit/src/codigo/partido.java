/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author alumno
 */
public class partido {
        private String equipo1;
        private String equipo2;
        private int goles1;
        private int goles2;

    public partido(String equipo1, String equipo2, int goles1, int goles2) {
        this.equipo1 = "PSG";
        this.equipo2 = "Real De Madrid";
        this.goles1 = 0;
        this.goles2 = 6;
    }

    @Override
    public String toString() {
        return  equipo1 + "vs" + equipo2 +"\n" +
                goles1 + "---" + goles2;
    }
    
        
        
}
