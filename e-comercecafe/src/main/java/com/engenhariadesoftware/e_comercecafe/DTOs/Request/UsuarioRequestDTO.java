package com.engenhariadesoftware.e_comercecafe.DTOs.Request;


import com.engenhariadesoftware.e_comercecafe.Enuns.UsuarioRoles;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UsuarioRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private UsuarioRoles role;
}
