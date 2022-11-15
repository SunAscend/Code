import java.util.concurrent.locks.ReentrantLock

fun lock() {
    val lock = ReentrantLock()
    lock.lock();
    try {
        //deal...
    } catch (e: java.lang.Exception) {

    } finally {
        lock.unlock()
    }

}