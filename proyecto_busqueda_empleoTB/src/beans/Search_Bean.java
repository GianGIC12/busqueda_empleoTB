/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author user
 */
public class Search_Bean {
    
    private String url;
    private String pais;
    private String fecha_busqueda;
    private String fecha_extraccion;

    public Search_Bean() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_busqueda() {
        return fecha_busqueda;
    }

    public void setFecha_busqueda(String fecha_busqueda) {
        this.fecha_busqueda = fecha_busqueda;
    }

    public String getFecha_extraccion() {
        return fecha_extraccion;
    }

    public void setFecha_extraccion(String fecha_extraccion) {
        this.fecha_extraccion = fecha_extraccion;
    }
    
    
    
    
    
    
}
