package pe.edu.cibertec.api_rest_ventas.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_rest_ventas.model.bd.Category;
import pe.edu.cibertec.api_rest_ventas.repository.CategoryRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public List<Category> listarCategorias() {
        return List.of();
    }

    @Override
    public Category guardarCategoria(Category category) {
        return null;
    }

    @Override
    public Category obtenerCategoriaxId(Integer id) {
        return null;
    }
}
