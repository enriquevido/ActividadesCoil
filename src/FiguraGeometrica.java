import java.util.Date;

class FiguraGeometrica {
    private String color;
    private boolean relleno;
    private Date fechaCreacion;

    FiguraGeometrica(){}

    FiguraGeometrica(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
        this.fechaCreacion = new Date();
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean estaRelleno(){
        return this.relleno;
    }

    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }

    public Date getFechaCreacion(){
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString(){
        return "Color: " + this.color + ". Está Relleno: " + this.relleno + ". Fecha de Creacion: " + this.fechaCreacion;

    }
}
