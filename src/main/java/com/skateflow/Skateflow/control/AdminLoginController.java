package com.skateflow.Skateflow.control;

import com.skateflow.Skateflow.model.AdminLogin;
import com.skateflow.Skateflow.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @Autowired
    private AdminLoginRepository adminLoginRepository;

    @PostMapping("/login")
    public String login(@RequestBody AdminLogin adminLogin) {
        AdminLogin existingAdmin = adminLoginRepository.findByUsername(adminLogin.getUsername());
        if (existingAdmin != null && existingAdmin.getPassword().equals(adminLogin.getPassword())) {
            return "Login bem-sucedido"; // Lembre-se de implementar a lógica de autenticação
        }
        return "Credenciais inválidas";
    }

    @GetMapping("/admins")
    public List<AdminLogin> getAllAdmins() {
        return adminLoginRepository.findAll();
    }

    // Outros métodos conforme necessário (por exemplo, registro, atualização)
}
