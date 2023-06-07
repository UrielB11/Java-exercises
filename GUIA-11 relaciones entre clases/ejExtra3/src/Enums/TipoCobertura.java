
package Enums;

public enum TipoCobertura {
    A("Cubre daños ocasionados a terceros."),
    B("Además de daños a terceros, cubre robo total, incendio total y destrucción total del vehículo por accidente."),
    C("Además de daños a terceros, incluye robo total y/o parcial, incendio total y/o parcial y destrucción total del rodado por incendio o por accidente."),
    D("Además de daños a terceros, cubre robo total y/o parcial, incendio total y/o parcial y destrucción total y/o parcial (según franquicia) de un vehículo por incendio o por accidente.");

    private final String descripcion;

    TipoCobertura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

