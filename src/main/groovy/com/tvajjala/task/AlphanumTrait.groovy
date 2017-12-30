package com.tvajjala.task
/**
 * Looks like abstract class, but supports multiple inheritance
 */
trait AlphanumTrait {

    def getAlphaNumString(length) {
        String uuid = UUID.randomUUID().toString()
        uuid.take(length)
    }
}