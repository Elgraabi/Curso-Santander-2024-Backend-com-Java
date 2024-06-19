package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
	private List<Usuario> usuarios = new ArrayList<>();
	private int currentId = 1;

	public Usuario save(Usuario usuario) {
		if (usuario.getId() == null) {
			usuario.setId(currentId++);
		}
		usuarios.add(usuario);
		return usuario;
	}

	// Busca todos os usuários
	public List<Usuario> findAll() {
		usuarios.add(new Usuario(1, "gabriel", "password"));
		usuarios.add(new Usuario(2, "teste1", "masterpass"));
		return new ArrayList<>(usuarios);
	}

	// Busca usuário por ID
	public Optional<Usuario> findById(int id) {
		return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst();
	}

	public Usuario findByIdUsuarioNome(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("gabriel", "password");
    }
	// Atualiza um usuário
	public Optional<Usuario> update(int id, Usuario updatedUsuario) {
		Optional<Usuario> optionalUsuario = findById(id);

		if (optionalUsuario.isPresent()) {
			Usuario usuario = optionalUsuario.get();
			usuario.setLogin(updatedUsuario.getLogin());
			usuario.setPassword(updatedUsuario.getPassword());
			return Optional.of(usuario);
		}

		return Optional.empty();
	}

	// Deleta um usuário
	public boolean deleteById(int id) {
		return usuarios.removeIf(usuario -> usuario.getId() == id);
	}
}
