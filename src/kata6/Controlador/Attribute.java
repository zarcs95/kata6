/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.Controlador;

/**
 *
 * @author javi
 * @param <T>
 * @param <S>
 */
public interface Attribute<T,S> {
    S get (T item);
}
