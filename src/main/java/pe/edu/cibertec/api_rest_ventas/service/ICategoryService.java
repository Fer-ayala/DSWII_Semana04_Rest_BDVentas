package pe.edu.cibertec.api_rest_ventas.service;

import pe.edu.cibertec.api_rest_ventas.model.bd.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> listarCategorias();
    Category guardarCategoria(Category category);
    Category obtenerCategoriaxId(Integer id);
}
