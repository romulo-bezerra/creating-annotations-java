package br.studies.power.creatingannotatios.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    private String nome;
    private LocalDate dataNascimento;

}
