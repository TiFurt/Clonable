package projeto.software.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TexturaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Textura textura = new Textura("textura", "caminho", 10);
        Textura clone = textura.clone();

        clone.setNome("clone");
        assert textura != clone;
        assertNotEquals(textura.getNome(), clone.getNome());
        assertEquals(clone.getNome(), "clone");
        assertEquals(clone.toString(), "Textura{nome=clone, caminho=caminho, largura=10}");
    }
}