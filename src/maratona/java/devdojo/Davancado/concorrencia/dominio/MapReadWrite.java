package maratona.java.devdojo.Davancado.concorrencia.dominio;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * - É possível ter mais de uma thread obtendo lock de leitura mas de escrita
 * apenas uma thread
 */
public class MapReadWrite {
	private final Map<String, String> map = new LinkedHashMap<>();
	private final ReentrantReadWriteLock rrwl;

	public MapReadWrite(ReentrantReadWriteLock rrwl) {
		this.rrwl = rrwl;
	}

	public void put(String key, String value) {
		rrwl.writeLock()
				.lock(); // Obtendo o lock de escrita

		try {
			if (rrwl.isWriteLocked()) {
				System.out.printf("%s obteve o WRITE lock%n", Thread.currentThread()
						.getName());
			}

			map.put(key, value);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			rrwl.writeLock()
					.unlock();
		}
	}

	public Set<String> allKeys() {
		rrwl.readLock()
				.lock();

		try {
			return map.keySet();
		} finally {
			rrwl.readLock()
					.unlock();
		}
	}

}
