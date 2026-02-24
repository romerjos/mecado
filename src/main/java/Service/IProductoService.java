package Service;

import dto.ProductoDTO;

import java.util.List;

public interface IProductoService {


    List<ProductoDTO> traerProductos();
    ProductoDTO crearProducto(ProductoDTO sucursalDto);
    ProductoDTO actualizarProducto(Long id, ProductoDTO sucursalDto);
    void eliminarProducto(Long id);

}
