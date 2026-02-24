package Service;

import dto.VentaDTO;

import java.util.List;

public interface IVentaService {


    List<VentaDTO> traerVentas();
    VentaDTO crearVenta(VentaDTO sucursalDto);
    VentaDTO actualizarVenta(Long id, VentaDTO sucursalDto);
    void eliminarVenta(Long id);

}
