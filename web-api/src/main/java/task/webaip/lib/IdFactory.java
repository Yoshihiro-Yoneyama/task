package task.webaip.lib;
/**
 * IDとして利用可能な値を生成する関数。
 *
 * <p>実装は副作用によりTの値を生成する。生成されたTの値同士の衝突確率は十分に低い必要がある。
 *
 * @param <T> IDの型
 */
public interface IdFactory<T> {
  T generate();
}
