package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "ESPAÇO LIVRE";

    public static final List<String> ALL_PROMPTS = List.of(
            "usa teclado mecânico",
            "trabalha remotamente",
            "já participou de hackathon",
            "usa IA no dia a dia",
            "tem canal de tecnologia favorito",
            "já migrou de sistema operacional",
            "acumula gadgets sem usar",
            "tem setup de trabalho",
            "já passou a noite em debug",
            "gosta de automação",
            "já configurou algum app do zero",
            "usa duas telas ou mais",
            "já teve problema com Wi‑Fi",
            "curte programação em Python",
            "já fez curso online de tecnologia",
            "é fã de hardware retrô",
            "tem conta em rede social de dev",
            "já instalou Linux no PC",
            "trabalha com dados ou BI",
            "já usou chatbot para estudar",
            "tem projeto pessoal em andamento",
            "usa atalhos de teclado favoritos",
            "já mudou de empresa por tecnologia",
            "tem playlist para focar em código"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
