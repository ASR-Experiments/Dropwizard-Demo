---
title: Dropwizard Demo
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.23"

---

# Dropwizard Demo

Base URLs:

* <a href="">DropWizard Demo: </a>

# Authentication

- HTTP Authentication, scheme: basic

# Admin

## GET Health Check

GET /healthcheck

### Health Check

This endpoint sends an HTTP GET request to `http://localhost:8081/healthcheck` to check the health status of the system.

**Request Body**  
This request does not require a request body.

**Response Body**  
The response returns the health status of different components of the system including deadlocks and hibernate. The response includes the status of each component, the duration, and the timestamp of the health check.

Example response:

``` json
{
    "deadlocks": {
        "healthy": true,
        "duration": 0,
        "timestamp": ""
    },
    "hibernate": {
        "healthy": true,
        "duration": 0,
        "timestamp": ""
    }
}

 ```

> Response Examples

> Sample Response

```json
{
  "deadlocks": {
    "healthy": true,
    "duration": 0,
    "timestamp": "2024-06-29T17:28:05.835+05:30"
  },
  "hibernate": {
    "healthy": true,
    "duration": 4,
    "timestamp": "2024-06-29T17:28:05.831+05:30"
  }
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample Response|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» deadlocks|object|true|none||none|
|»» healthy|boolean|true|none||none|
|»» duration|integer|true|none||none|
|»» timestamp|string|true|none||none|
|» hibernate|object|true|none||none|
|»» healthy|boolean|true|none||none|
|»» duration|integer|true|none||none|
|»» timestamp|string|true|none||none|

## GET Metrics

GET /metrics

### Get Metrics

This endpoint is used to retrieve the metrics data.

#### Request Body
This endpoint does not require a request body.

#### Response
The response will contain the metrics data in JSON format.

> Response Examples

> Sample Metrics

```json
{
  "version": "4.0.0",
  "gauges": {
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.active": {
      "value": 0
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.borrowed": {
      "value": 2
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.created": {
      "value": 10
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.idle": {
      "value": 8
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.reconnected": {
      "value": 0
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.released": {
      "value": 2
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.releasedIdle": {
      "value": 2
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.removeAbandoned": {
      "value": 0
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.returned": {
      "value": 12
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.size": {
      "value": 8
    },
    "io.dropwizard.db.ManagedPooledDataSource.hibernate.waiting": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-15m": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-1m": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-5m": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-15m": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-1m": {
      "value": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-5m": {
      "value": 0
    },
    "jvm.attribute.name": {
      "value": "36954@US-GPD7MFK6HY"
    },
    "jvm.attribute.uptime": {
      "value": 124868
    },
    "jvm.attribute.vendor": {
      "value": "Amazon.com Inc. OpenJDK 64-Bit Server VM 21.0.3+9-LTS (21)"
    },
    "jvm.buffers.direct.capacity": {
      "value": 155653
    },
    "jvm.buffers.direct.count": {
      "value": 11
    },
    "jvm.buffers.direct.used": {
      "value": 155653
    },
    "jvm.buffers.mapped.capacity": {
      "value": 0
    },
    "jvm.buffers.mapped.count": {
      "value": 0
    },
    "jvm.buffers.mapped.used": {
      "value": 0
    },
    "jvm.classloader.loaded": {
      "value": 14449
    },
    "jvm.classloader.unloaded": {
      "value": 0
    },
    "jvm.filedescriptor": {
      "value": 0.01640625
    },
    "jvm.gc.G1-Concurrent-GC.count": {
      "value": 6
    },
    "jvm.gc.G1-Concurrent-GC.time": {
      "value": 6
    },
    "jvm.gc.G1-Old-Generation.count": {
      "value": 0
    },
    "jvm.gc.G1-Old-Generation.time": {
      "value": 0
    },
    "jvm.gc.G1-Young-Generation.count": {
      "value": 9
    },
    "jvm.gc.G1-Young-Generation.time": {
      "value": 38
    },
    "jvm.memory.heap.committed": {
      "value": 98566144
    },
    "jvm.memory.heap.init": {
      "value": 268435456
    },
    "jvm.memory.heap.max": {
      "value": 4294967296
    },
    "jvm.memory.heap.usage": {
      "value": 0.014752700924873352
    },
    "jvm.memory.heap.used": {
      "value": 63362368
    },
    "jvm.memory.non-heap.committed": {
      "value": 98631680
    },
    "jvm.memory.non-heap.init": {
      "value": 7667712
    },
    "jvm.memory.non-heap.max": {
      "value": -1
    },
    "jvm.memory.non-heap.usage": {
      "value": 0.9829893194559801
    },
    "jvm.memory.non-heap.used": {
      "value": 96977920
    },
    "jvm.memory.pools.CodeHeap-'non-nmethods'.committed": {
      "value": 2555904
    },
    "jvm.memory.pools.CodeHeap-'non-nmethods'.init": {
      "value": 2555904
    },
    "jvm.memory.pools.CodeHeap-'non-nmethods'.max": {
      "value": 5849088
    },
    "jvm.memory.pools.CodeHeap-'non-nmethods'.usage": {
      "value": 0.2889311974789916
    },
    "jvm.memory.pools.CodeHeap-'non-nmethods'.used": {
      "value": 1662208
    },
    "jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.committed": {
      "value": 3538944
    },
    "jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.init": {
      "value": 2555904
    },
    "jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.max": {
      "value": 122912768
    },
    "jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.usage": {
      "value": 0.0286715209277526
    },
    "jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.used": {
      "value": 3524096
    },
    "jvm.memory.pools.CodeHeap-'profiled-nmethods'.committed": {
      "value": 11665408
    },
    "jvm.memory.pools.CodeHeap-'profiled-nmethods'.init": {
      "value": 2555904
    },
    "jvm.memory.pools.CodeHeap-'profiled-nmethods'.max": {
      "value": 122896384
    },
    "jvm.memory.pools.CodeHeap-'profiled-nmethods'.usage": {
      "value": 0.09449781695773897
    },
    "jvm.memory.pools.CodeHeap-'profiled-nmethods'.used": {
      "value": 11613440
    },
    "jvm.memory.pools.Compressed-Class-Space.committed": {
      "value": 9830400
    },
    "jvm.memory.pools.Compressed-Class-Space.init": {
      "value": 0
    },
    "jvm.memory.pools.Compressed-Class-Space.max": {
      "value": 1073741824
    },
    "jvm.memory.pools.Compressed-Class-Space.usage": {
      "value": 0.008959688246250153
    },
    "jvm.memory.pools.Compressed-Class-Space.used": {
      "value": 9620392
    },
    "jvm.memory.pools.G1-Eden-Space.committed": {
      "value": 52428800
    },
    "jvm.memory.pools.G1-Eden-Space.init": {
      "value": 23068672
    },
    "jvm.memory.pools.G1-Eden-Space.max": {
      "value": -1
    },
    "jvm.memory.pools.G1-Eden-Space.usage": {
      "value": 0.72
    },
    "jvm.memory.pools.G1-Eden-Space.used": {
      "value": 37748736
    },
    "jvm.memory.pools.G1-Eden-Space.used-after-gc": {
      "value": 0
    },
    "jvm.memory.pools.G1-Old-Gen.committed": {
      "value": 35651584
    },
    "jvm.memory.pools.G1-Old-Gen.init": {
      "value": 245366784
    },
    "jvm.memory.pools.G1-Old-Gen.max": {
      "value": 4294967296
    },
    "jvm.memory.pools.G1-Old-Gen.usage": {
      "value": 0.003522232174873352
    },
    "jvm.memory.pools.G1-Old-Gen.used": {
      "value": 15127872
    },
    "jvm.memory.pools.G1-Old-Gen.used-after-gc": {
      "value": 15127872
    },
    "jvm.memory.pools.G1-Survivor-Space.committed": {
      "value": 10485760
    },
    "jvm.memory.pools.G1-Survivor-Space.init": {
      "value": 0
    },
    "jvm.memory.pools.G1-Survivor-Space.max": {
      "value": -1
    },
    "jvm.memory.pools.G1-Survivor-Space.usage": {
      "value": 1
    },
    "jvm.memory.pools.G1-Survivor-Space.used": {
      "value": 10485760
    },
    "jvm.memory.pools.G1-Survivor-Space.used-after-gc": {
      "value": 10485760
    },
    "jvm.memory.pools.Metaspace.committed": {
      "value": 71041024
    },
    "jvm.memory.pools.Metaspace.init": {
      "value": 0
    },
    "jvm.memory.pools.Metaspace.max": {
      "value": -1
    },
    "jvm.memory.pools.Metaspace.usage": {
      "value": 0.9934428873097325
    },
    "jvm.memory.pools.Metaspace.used": {
      "value": 70575200
    },
    "jvm.memory.total.committed": {
      "value": 197197824
    },
    "jvm.memory.total.init": {
      "value": 276103168
    },
    "jvm.memory.total.max": {
      "value": -1
    },
    "jvm.memory.total.used": {
      "value": 160358088
    },
    "jvm.threads.blocked.count": {
      "value": 0
    },
    "jvm.threads.count": {
      "value": 32
    },
    "jvm.threads.daemon.count": {
      "value": 9
    },
    "jvm.threads.deadlock.count": {
      "value": 0
    },
    "jvm.threads.deadlocks": {
      "value": []
    },
    "jvm.threads.new.count": {
      "value": 0
    },
    "jvm.threads.peak.count": {
      "value": 32
    },
    "jvm.threads.runnable.count": {
      "value": 15
    },
    "jvm.threads.terminated.count": {
      "value": 0
    },
    "jvm.threads.timed_waiting.count": {
      "value": 12
    },
    "jvm.threads.total_started.count": {
      "value": 35
    },
    "jvm.threads.waiting.count": {
      "value": 5
    },
    "org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.available-connections": {
      "value": 0
    },
    "org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.leased-connections": {
      "value": 0
    },
    "org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.max-connections": {
      "value": 1024
    },
    "org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.pending-connections": {
      "value": 0
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.jobs": {
      "value": 0
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.jobs-queue-utilization": {
      "value": 0
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.size": {
      "value": 9
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.utilization": {
      "value": 0.7777777777777778
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.utilization-max": {
      "value": 0.109375
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw.jobs": {
      "value": 0
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw.jobs-queue-utilization": {
      "value": 0
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw.size": {
      "value": 10
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw.utilization": {
      "value": 0.5
    },
    "org.eclipse.jetty.util.thread.QueuedThreadPool.dw.utilization-max": {
      "value": 0.0048828125
    }
  },
  "counters": {
    "TimeBoundHealthCheck-pool.running": {
      "count": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions-weight": {
      "count": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.hits": {
      "count": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.misses": {
      "count": 1
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions-weight": {
      "count": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.hits": {
      "count": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.misses": {
      "count": 1
    },
    "io.dropwizard.jersey.errors.EofExceptionWriterInterceptor.eof-exceptions": {
      "count": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.active-dispatches": {
      "count": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.active-requests": {
      "count": 0
    },
    "io.dropwizard.jetty.MutableServletContextHandler.active-suspended": {
      "count": 0
    },
    "jersey-client-true-application.running": {
      "count": 0
    }
  },
  "histograms": {
    "io.dropwizard.auth.CachingAuthenticator.evictions": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions.COLLECTED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions.EXPIRED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions.EXPLICIT": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions.REPLACED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthenticator.evictions.SIZE": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions.COLLECTED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions.EXPIRED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions.EXPLICIT": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions.REPLACED": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    },
    "io.dropwizard.auth.CachingAuthorizer.evictions.SIZE": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0
    }
  },
  "meters": {
    "TimeBoundHealthCheck-pool.created": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "TimeBoundHealthCheck-pool.terminated": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.all": {
      "count": 22,
      "m15_rate": 3.3471604381036575,
      "m1_rate": 0.5680275717255824,
      "m5_rate": 2.5971314640496677,
      "mean_rate": 0.17790878249765074,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.debug": {
      "count": 1,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008086811588187443,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.error": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.info": {
      "count": 20,
      "m15_rate": 3.3451774197731186,
      "m1_rate": 0.5619869079707358,
      "m5_rate": 2.592394175707638,
      "mean_rate": 0.16173621792061435,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.trace": {
      "count": 1,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008086802002115074,
      "units": "events/second"
    },
    "ch.qos.logback.core.Appender.warn": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.1xx-responses": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.2xx-responses": {
      "count": 1,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197799761667087,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.3xx-responses": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.4xx-responses": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.5xx-responses": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.async-dispatches": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.async-timeouts": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "jersey-client-true-application.created": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "jersey-client-true-application.terminated": {
      "count": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "units": "events/second"
    },
    "org.asr.experiments.resources.filter.AuthenticationFilter.cache-misses": {
      "count": 1,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008167090173862246,
      "units": "events/second"
    },
    "org.asr.experiments.resources.filter.AuthorizationFilter.cache-misses": {
      "count": 1,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008168049671805956,
      "units": "events/second"
    }
  },
  "timers": {
    "io.dropwizard.auth.CachingAuthenticator.loads-failure": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.auth.CachingAuthenticator.loads-success": {
      "count": 1,
      "max": 0.248438084,
      "mean": 0.248438084,
      "min": 0.248438084,
      "p50": 0.248438084,
      "p75": 0.248438084,
      "p95": 0.248438084,
      "p98": 0.248438084,
      "p99": 0.248438084,
      "p999": 0.248438084,
      "stddev": 0,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008167821958968601,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.auth.CachingAuthorizer.loads-failure": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.auth.CachingAuthorizer.loads-success": {
      "count": 1,
      "max": 25.60635925,
      "mean": 25.60635925,
      "min": 25.60635925,
      "p50": 25.60635925,
      "p75": 25.60635925,
      "p95": 25.60635925,
      "p98": 25.60635925,
      "p99": 25.60635925,
      "p999": 25.60635925,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008168037832284727,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.connect-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.delete-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.dispatches": {
      "count": 1,
      "max": 27.284000000000002,
      "mean": 27.284000000000002,
      "min": 27.284000000000002,
      "p50": 27.284000000000002,
      "p75": 27.284000000000002,
      "p95": 27.284000000000002,
      "p98": 27.284000000000002,
      "p99": 27.284000000000002,
      "p999": 27.284000000000002,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197704361233616,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.get-requests": {
      "count": 1,
      "max": 27.284000000000002,
      "mean": 27.284000000000002,
      "min": 27.284000000000002,
      "p50": 27.284000000000002,
      "p75": 27.284000000000002,
      "p95": 27.284000000000002,
      "p98": 27.284000000000002,
      "p99": 27.284000000000002,
      "p999": 27.284000000000002,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.00819771418125697,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.head-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.move-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.options-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.other-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.post-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.put-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.requests": {
      "count": 1,
      "max": 27.284000000000002,
      "mean": 27.284000000000002,
      "min": 27.284000000000002,
      "p50": 27.284000000000002,
      "p75": 27.284000000000002,
      "p95": 27.284000000000002,
      "p98": 27.284000000000002,
      "p99": 27.284000000000002,
      "p999": 27.284000000000002,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197679507659747,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "io.dropwizard.jetty.MutableServletContextHandler.trace-requests": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.apache.hc.client5.http.classic.HttpClient.true-application.get-requests": {
      "count": 1,
      "max": 0.32539041700000004,
      "mean": 0.32539041700000004,
      "min": 0.32539041700000004,
      "p50": 0.32539041700000004,
      "p75": 0.32539041700000004,
      "p95": 0.32539041700000004,
      "p98": 0.32539041700000004,
      "p99": 0.32539041700000004,
      "p999": 0.32539041700000004,
      "stddev": 0,
      "m15_rate": 0.18503399940684034,
      "m1_rate": 0.06228064478291957,
      "m5_rate": 0.15837791326735634,
      "mean_rate": 0.012762958199153362,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.EmployeeResource.getEmployees": {
      "count": 1,
      "max": 1.382116208,
      "mean": 1.382116208,
      "min": 1.382116208,
      "p50": 1.382116208,
      "p75": 1.382116208,
      "p95": 1.382116208,
      "p98": 1.382116208,
      "p99": 1.382116208,
      "p999": 1.382116208,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197584124002788,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.EmployeeResource.getEmployees.request.filtering": {
      "count": 1,
      "max": 25.864870792,
      "mean": 25.864870792,
      "min": 25.864870792,
      "p50": 25.864870792,
      "p75": 25.864870792,
      "p95": 25.864870792,
      "p98": 25.864870792,
      "p99": 25.864870792,
      "p999": 25.864870792,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.00819758134916541,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.EmployeeResource.getEmployees.response.filtering": {
      "count": 1,
      "max": 0.000043708,
      "mean": 0.000043708,
      "min": 0.000043708,
      "p50": 0.000043708,
      "p75": 0.000043708,
      "p95": 0.000043708,
      "p98": 0.000043708,
      "p99": 0.000043708,
      "p999": 0.000043708,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197577160368761,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.EmployeeResource.getEmployees.total": {
      "count": 1,
      "max": 27.268754375,
      "mean": 27.268754375,
      "min": 27.268754375,
      "p50": 27.268754375,
      "p75": 27.268754375,
      "p95": 27.268754375,
      "p98": 27.268754375,
      "p99": 27.268754375,
      "p999": 27.268754375,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008197574503136493,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.HelloWorldResource.sayHello": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.HelloWorldResource.sayHello.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.HelloWorldResource.sayHello.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.HelloWorldResource.sayHello.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.addUser": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.addUser.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.addUser.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.addUser.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.deleteUser": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.deleteUser.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.deleteUser.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.deleteUser.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.findUser": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.findUser.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.findUser.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.findUser.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.getAllUsers": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.getAllUsers.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.getAllUsers.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.getAllUsers.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.updateUser": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.updateUser.request.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.updateUser.response.filtering": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.UserResource.updateUser.total": {
      "count": 0,
      "max": 0,
      "mean": 0,
      "min": 0,
      "p50": 0,
      "p75": 0,
      "p95": 0,
      "p98": 0,
      "p99": 0,
      "p999": 0,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.filter.AuthenticationFilter.gets": {
      "count": 1,
      "max": 0.25039500000000003,
      "mean": 0.25039500000000003,
      "min": 0.25039500000000003,
      "p50": 0.25039500000000003,
      "p75": 0.25039500000000003,
      "p95": 0.25039500000000003,
      "p98": 0.25039500000000003,
      "p99": 0.25039500000000003,
      "p999": 0.25039500000000003,
      "stddev": 0,
      "m15_rate": 0.0009915091652691948,
      "m1_rate": 0.0030203318774233434,
      "m5_rate": 0.0023686441710151626,
      "mean_rate": 0.008166987985919655,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.asr.experiments.resources.filter.AuthorizationFilter.gets": {
      "count": 1,
      "max": 25.606727333000002,
      "mean": 25.606727333000002,
      "min": 25.606727333000002,
      "p50": 25.606727333000002,
      "p75": 25.606727333000002,
      "p95": 25.606727333000002,
      "p98": 25.606727333000002,
      "p99": 25.606727333000002,
      "p999": 25.606727333000002,
      "stddev": 0,
      "m15_rate": 0.0010194371798584528,
      "m1_rate": 0.004581531748892666,
      "m5_rate": 0.0025744889413512346,
      "mean_rate": 0.008167928084554204,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.eclipse.jetty.server.HttpConnectionFactory.8080.connections": {
      "count": 2,
      "max": 57.307880375,
      "mean": 40.2095150622085,
      "min": 0.004856916,
      "p50": 57.307880375,
      "p75": 57.307880375,
      "p95": 57.307880375,
      "p98": 57.307880375,
      "p99": 57.307880375,
      "p999": 57.307880375,
      "stddev": 26.21896131161133,
      "m15_rate": 0.0020455002840589088,
      "m1_rate": 0.010574000724210638,
      "m5_rate": 0.00521389447790391,
      "mean_rate": 0.016356760052297234,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    },
    "org.eclipse.jetty.server.HttpConnectionFactory.8081.connections": {
      "count": 1,
      "max": 0.0005445410000000001,
      "mean": 0.0005445410000000001,
      "min": 0.0005445410000000001,
      "p50": 0.0005445410000000001,
      "p75": 0.0005445410000000001,
      "p95": 0.0005445410000000001,
      "p98": 0.0005445410000000001,
      "p99": 0.0005445410000000001,
      "p999": 0.0005445410000000001,
      "stddev": 0,
      "m15_rate": 0,
      "m1_rate": 0,
      "m5_rate": 0,
      "mean_rate": 0.008178708669311065,
      "duration_units": "seconds",
      "rate_units": "calls/second"
    }
  }
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample Metrics|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» version|string|true|none||none|
|» gauges|object|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.active|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.borrowed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.created|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.idle|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.reconnected|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.released|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.releasedIdle|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.removeAbandoned|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.returned|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.size|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.db.ManagedPooledDataSource.hibernate.waiting|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-15m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-1m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-4xx-5m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-15m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-1m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.percent-5xx-5m|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.attribute.name|object|true|none||none|
|»»» value|string|true|none||none|
|»» jvm.attribute.uptime|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.attribute.vendor|object|true|none||none|
|»»» value|string|true|none||none|
|»» jvm.buffers.direct.capacity|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.buffers.direct.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.buffers.direct.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.buffers.mapped.capacity|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.buffers.mapped.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.buffers.mapped.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.classloader.loaded|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.classloader.unloaded|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.filedescriptor|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.gc.G1-Concurrent-GC.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.gc.G1-Concurrent-GC.time|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.gc.G1-Old-Generation.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.gc.G1-Old-Generation.time|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.gc.G1-Young-Generation.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.gc.G1-Young-Generation.time|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.heap.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.heap.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.heap.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.heap.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.heap.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.non-heap.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.non-heap.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.non-heap.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.non-heap.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.non-heap.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-nmethods'.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-nmethods'.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-nmethods'.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-nmethods'.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-nmethods'.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.CodeHeap-'non-profiled-nmethods'.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'profiled-nmethods'.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'profiled-nmethods'.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'profiled-nmethods'.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.CodeHeap-'profiled-nmethods'.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.CodeHeap-'profiled-nmethods'.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Compressed-Class-Space.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Compressed-Class-Space.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Compressed-Class-Space.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Compressed-Class-Space.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.Compressed-Class-Space.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Eden-Space.used-after-gc|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Old-Gen.used-after-gc|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.usage|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.G1-Survivor-Space.used-after-gc|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Metaspace.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Metaspace.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Metaspace.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.pools.Metaspace.usage|object|true|none||none|
|»»» value|number|true|none||none|
|»» jvm.memory.pools.Metaspace.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.total.committed|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.total.init|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.total.max|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.memory.total.used|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.blocked.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.daemon.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.deadlock.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.deadlocks|object|true|none||none|
|»»» value|[string]|true|none||none|
|»» jvm.threads.new.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.peak.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.runnable.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.terminated.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.timed_waiting.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.total_started.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» jvm.threads.waiting.count|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.available-connections|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.leased-connections|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.max-connections|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.apache.hc.client5.http.io.HttpClientConnectionManager.true-application.pending-connections|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.jobs|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.jobs-queue-utilization|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.size|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.utilization|object|true|none||none|
|»»» value|number|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw-admin.utilization-max|object|true|none||none|
|»»» value|number|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw.jobs|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw.jobs-queue-utilization|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw.size|object|true|none||none|
|»»» value|integer|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw.utilization|object|true|none||none|
|»»» value|number|true|none||none|
|»» org.eclipse.jetty.util.thread.QueuedThreadPool.dw.utilization-max|object|true|none||none|
|»»» value|number|true|none||none|
|» counters|object|true|none||none|
|»» TimeBoundHealthCheck-pool.running|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions-weight|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.hits|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.misses|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions-weight|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.hits|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.misses|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.jersey.errors.EofExceptionWriterInterceptor.eof-exceptions|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.active-dispatches|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.active-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.active-suspended|object|true|none||none|
|»»» count|integer|true|none||none|
|»» jersey-client-true-application.running|object|true|none||none|
|»»» count|integer|true|none||none|
|» histograms|object|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions.COLLECTED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions.EXPIRED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions.EXPLICIT|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions.REPLACED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.evictions.SIZE|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions.COLLECTED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions.EXPIRED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions.EXPLICIT|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions.REPLACED|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.evictions.SIZE|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|» meters|object|true|none||none|
|»» TimeBoundHealthCheck-pool.created|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» TimeBoundHealthCheck-pool.terminated|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.all|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.debug|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.error|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.info|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.trace|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» ch.qos.logback.core.Appender.warn|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.1xx-responses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.2xx-responses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.3xx-responses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.4xx-responses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.5xx-responses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.async-dispatches|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.async-timeouts|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» jersey-client-true-application.created|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» jersey-client-true-application.terminated|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» units|string|true|none||none|
|»» org.asr.experiments.resources.filter.AuthenticationFilter.cache-misses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|»» org.asr.experiments.resources.filter.AuthorizationFilter.cache-misses|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» units|string|true|none||none|
|» timers|object|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.loads-failure|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.auth.CachingAuthenticator.loads-success|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.loads-failure|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.auth.CachingAuthorizer.loads-success|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.connect-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.delete-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.dispatches|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.get-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.head-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.move-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.options-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.other-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.post-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.put-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» io.dropwizard.jetty.MutableServletContextHandler.trace-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.apache.hc.client5.http.classic.HttpClient.true-application.get-requests|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.EmployeeResource.getEmployees|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.EmployeeResource.getEmployees.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.EmployeeResource.getEmployees.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.EmployeeResource.getEmployees.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.HelloWorldResource.sayHello|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.HelloWorldResource.sayHello.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.HelloWorldResource.sayHello.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.HelloWorldResource.sayHello.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.addUser|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.addUser.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.addUser.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.addUser.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.deleteUser|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.deleteUser.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.deleteUser.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.deleteUser.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.findUser|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.findUser.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.findUser.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.findUser.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.getAllUsers|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.getAllUsers.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.getAllUsers.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.getAllUsers.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.updateUser|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.updateUser.request.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.updateUser.response.filtering|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.UserResource.updateUser.total|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|integer|true|none||none|
|»»» mean|integer|true|none||none|
|»»» min|integer|true|none||none|
|»»» p50|integer|true|none||none|
|»»» p75|integer|true|none||none|
|»»» p95|integer|true|none||none|
|»»» p98|integer|true|none||none|
|»»» p99|integer|true|none||none|
|»»» p999|integer|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|integer|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.filter.AuthenticationFilter.gets|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.asr.experiments.resources.filter.AuthorizationFilter.gets|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.eclipse.jetty.server.HttpConnectionFactory.8080.connections|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|number|true|none||none|
|»»» m15_rate|number|true|none||none|
|»»» m1_rate|number|true|none||none|
|»»» m5_rate|number|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|
|»» org.eclipse.jetty.server.HttpConnectionFactory.8081.connections|object|true|none||none|
|»»» count|integer|true|none||none|
|»»» max|number|true|none||none|
|»»» mean|number|true|none||none|
|»»» min|number|true|none||none|
|»»» p50|number|true|none||none|
|»»» p75|number|true|none||none|
|»»» p95|number|true|none||none|
|»»» p98|number|true|none||none|
|»»» p99|number|true|none||none|
|»»» p999|number|true|none||none|
|»»» stddev|integer|true|none||none|
|»»» m15_rate|integer|true|none||none|
|»»» m1_rate|integer|true|none||none|
|»»» m5_rate|integer|true|none||none|
|»»» mean_rate|number|true|none||none|
|»»» duration_units|string|true|none||none|
|»»» rate_units|string|true|none||none|

## GET Ping

GET /ping

### Ping Endpoint

This endpoint sends an HTTP GET request to `http://localhost:8081/ping` to check the availability of the server.

#### Request Body

This request does not require a request body.

#### Response Body

The response returns a status code of 200 and a content type of `text/plain`. The body of the response contains the message "pong", indicating that the server is available.

> Response Examples

> Pong

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Pong|Inline|

### Responses Data Schema

# App

## GET Hello world

GET /hello-world

### Get Hello World

This endpoint sends an HTTP GET request to retrieve a hello world message with the provided name.

#### Request Parameters

- `name` (query parameter, required): The name for which the hello world message is requested.
    

#### Response

- `id` (number): The identifier for the hello world message.
    
- `content` (string): The hello world message content.
    

#### Example

Request:

```
GET http://localhost:8080/hello-world?name=John

 ```

Response:

``` json
{
    "id": 1,
    "content": "Hello, Stranger!"
}

 ```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|name|query|string| yes |none|

> Response Examples

> Sample Stranger Response

```json
{
  "id": 1,
  "content": "Hello, Stranger!"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample Stranger Response|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» content|string|true|none||none|

# App/User

## GET Get all users

GET /user

### Get User Details

This endpoint makes an HTTP GET request to localhost:8080/user to retrieve user details.

#### Request Body
This request does not require a request body.

#### Response
The response will contain an array of user objects, each including the following fields:
- `id` (number): The unique identifier for the user.
- `name` (string): The name of the user.
- `email` (string): The email address of the user.
- `password` (string): The password of the user.
- `role` (string): The role of the user.

Example response:
```json
[
    {
        "id": 0,
        "name": "",
        "email": "",
        "password": "",
        "role": ""
    }
]
```

> Response Examples

> All users

```json
[
  {
    "id": -47,
    "name": "Arvind",
    "email": "asr@yopmail.com",
    "password": "123",
    "role": "USER"
  },
  {
    "id": -45,
    "name": "Vikash",
    "email": "vik@yopmail.com",
    "password": "456",
    "role": "USER"
  },
  {
    "id": 3,
    "name": "Nitesh",
    "email": "nit@yopmail.com",
    "password": "789",
    "role": "USER"
  },
  {
    "id": 4,
    "name": "Shashwat",
    "email": "sas@yopmail.com",
    "password": "910",
    "role": "USER"
  },
  {
    "id": 5,
    "name": "Shivam",
    "email": "shiv@yopmail.com",
    "password": "345",
    "role": "USER"
  },
  {
    "id": 6,
    "name": "username",
    "email": "username@test.com",
    "password": "password",
    "role": "ADMIN"
  },
  {
    "id": 8,
    "name": "user2",
    "email": "user2@test.com",
    "password": "password2",
    "role": "USER"
  },
  {
    "id": 9,
    "name": "user3",
    "email": "user3@test.com",
    "password": "password3",
    "role": "USER"
  },
  {
    "id": 11,
    "name": "user4",
    "email": "user4@test.com",
    "password": "password4",
    "role": "USER"
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|All users|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» email|string|true|none||none|
|» password|string|true|none||none|
|» role|string|true|none||none|

## POST Create user

POST /user

# User Endpoint

This endpoint allows you to create a new user.

## Request Body

- `name` (string, required): The name of the user.
    
- `email` (string, required): The email address of the user.
    
- `password` (string, required): The password for the user account.
    
- `role` (string, optional): The role of the user. Default: **USER**
    

## Response

The response is a JSON object with the following properties:

- `id` (number): The unique identifier for the user.
    
- `name` (string): The name of the user.
    
- `email` (string): The email address of the user.
    
- `password` (string): The password for the user account.
    
- `role` (string): The role of the user.
    

## JSON Schema for Response

``` json
{
    "type": "object",
    "properties": {
        "id": {
            "type": "number"
        },
        "name": {
            "type": "string"
        },
        "email": {
            "type": "string"
        },
        "password": {
            "type": "string"
        },
        "role": {
            "type": "string"
        }
    }
}

 ```

> Body Parameters

```json
{
  "name": "user",
  "email": "user@test.com",
  "password": "password",
  "role": "USER"
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|body|body|object| no |none|
|» name|body|string| yes |none|
|» email|body|string| yes |none|
|» password|body|string| yes |none|
|» role|body|string| yes |none|

> Response Examples

> Sample User

```json
{
  "id": 15,
  "name": "user",
  "email": "user@test.com",
  "password": "password",
  "role": "USER"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample User|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» email|string|true|none||none|
|» password|string|true|none||none|
|» role|string|true|none||none|

## GET Get user by ID

GET /user/{userId}

This endpoint retrieves user information based on the provided userId. The response will be in JSON format and will include the user's id, name, email, password, and role.

### Authentication
This request requires authentication to access user-specific information. The user making the request must be authenticated and authorized to view the user details.

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|path|string| yes |none|

> Response Examples

> Sample user

```json
{
  "id": 15,
  "name": "user",
  "email": "user@test.com",
  "password": "password",
  "role": "USER"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample user|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» email|string|true|none||none|
|» password|string|true|none||none|
|» role|string|true|none||none|

## PUT Update user by ID

PUT /user/{userId}

### Update User Details
---
This endpoint allows the client to update user details by sending an HTTP PUT request to localhost:8080/user/:userId.

#### Request Body
- id (number): The unique identifier of the user.
- name (string): The name of the user.
- email (string): The email address of the user.
- password (string): The password of the user.
- role (string): The role of the user.

#### Response
The response will be in JSON format with the following schema:
```json
{
    "type": "object",
    "properties": {
        "id": {
            "type": "number"
        },
        "name": {
            "type": "string"
        },
        "email": {
            "type": "string"
        },
        "password": {
            "type": "string"
        },
        "role": {
            "type": "string"
        }
    }
}
```
An example response for this request is:
```json
{
    "id": 0,
    "name": "",
    "email": "",
    "password": "",
    "role": ""
}
```

> Body Parameters

```json
{
  "id": 15,
  "name": "sample_user",
  "email": "user@test.com",
  "password": "password",
  "role": "USER"
}
```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|path|string| yes |none|
|body|body|object| no |none|
|» id|body|integer| yes |none|
|» name|body|string| yes |none|
|» email|body|string| yes |none|
|» password|body|string| yes |none|
|» role|body|string| yes |none|

> Response Examples

> Sample Update

```json
{
  "id": 13,
  "name": "sample_user",
  "email": "user@test.com",
  "password": "password",
  "role": "ADMIN"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample Update|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» email|string|true|none||none|
|» password|string|true|none||none|
|» role|string|true|none||none|

## DELETE Delete user by ID

DELETE /user/{userId}

### Delete User

This endpoint is used to delete a user with the specified user ID.

#### Request Body

This endpoint does not require a request body.

#### Response

- Status: 200
    
- Content-Type: application/json
    

Example Response Body:

``` json
{
    "id": 0,
    "name": "",
    "email": "",
    "password": "",
    "role": ""
}

 ```

### Params

|Name|Location|Type|Required|Description|
|---|---|---|---|---|
|userId|path|string| yes |none|

> Response Examples

> Sample response

```json
{
  "id": 16,
  "name": "user2",
  "email": "user2@2test.com",
  "password": "password2",
  "role": "USER"
}
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample response|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» email|string|true|none||none|
|» password|string|true|none||none|
|» role|string|true|none||none|

# App/Employee

## GET Get all Employees

GET /employee

# Employee Details

This endpoint retrieves the details of employees.

## Request

- Method: `GET`
    
- Endpoint: `localhost:8080/employee`
    

## Response

The response will be a JSON array containing the details of the employees. Here is an example of the response schema:

``` json
[
  {
    "id": 0,
    "name": "",
    "username": "",
    "email": "",
    "address": {
      "street": "",
      "suite": "",
      "city": "",
      "zipcode": "",
      "geo": {
        "lat": "",
        "lng": ""
      }
    },
    "phone": "",
    "website": "",
    "company": {
      "name": "",
      "catchPhrase": "",
      "bs": ""
    }
  }
]

 ```

> Response Examples

> Sample employee details

```json
[
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  },
  {
    "id": 2,
    "name": "Ervin Howell",
    "username": "Antonette",
    "email": "Shanna@melissa.tv",
    "address": {
      "street": "Victor Plains",
      "suite": "Suite 879",
      "city": "Wisokyburgh",
      "zipcode": "90566-7771",
      "geo": {
        "lat": "-43.9509",
        "lng": "-34.4618"
      }
    },
    "phone": "010-692-6593 x09125",
    "website": "anastasia.net",
    "company": {
      "name": "Deckow-Crist",
      "catchPhrase": "Proactive didactic contingency",
      "bs": "synergize scalable supply-chains"
    }
  },
  {
    "id": 3,
    "name": "Clementine Bauch",
    "username": "Samantha",
    "email": "Nathan@yesenia.net",
    "address": {
      "street": "Douglas Extension",
      "suite": "Suite 847",
      "city": "McKenziehaven",
      "zipcode": "59590-4157",
      "geo": {
        "lat": "-68.6102",
        "lng": "-47.0653"
      }
    },
    "phone": "1-463-123-4447",
    "website": "ramiro.info",
    "company": {
      "name": "Romaguera-Jacobson",
      "catchPhrase": "Face to face bifurcated interface",
      "bs": "e-enable strategic applications"
    }
  },
  {
    "id": 4,
    "name": "Patricia Lebsack",
    "username": "Karianne",
    "email": "Julianne.OConner@kory.org",
    "address": {
      "street": "Hoeger Mall",
      "suite": "Apt. 692",
      "city": "South Elvis",
      "zipcode": "53919-4257",
      "geo": {
        "lat": "29.4572",
        "lng": "-164.2990"
      }
    },
    "phone": "493-170-9623 x156",
    "website": "kale.biz",
    "company": {
      "name": "Robel-Corkery",
      "catchPhrase": "Multi-tiered zero tolerance productivity",
      "bs": "transition cutting-edge web services"
    }
  },
  {
    "id": 5,
    "name": "Chelsey Dietrich",
    "username": "Kamren",
    "email": "Lucio_Hettinger@annie.ca",
    "address": {
      "street": "Skiles Walks",
      "suite": "Suite 351",
      "city": "Roscoeview",
      "zipcode": "33263",
      "geo": {
        "lat": "-31.8129",
        "lng": "62.5342"
      }
    },
    "phone": "(254)954-1289",
    "website": "demarco.info",
    "company": {
      "name": "Keebler LLC",
      "catchPhrase": "User-centric fault-tolerant solution",
      "bs": "revolutionize end-to-end systems"
    }
  },
  {
    "id": 6,
    "name": "Mrs. Dennis Schulist",
    "username": "Leopoldo_Corkery",
    "email": "Karley_Dach@jasper.info",
    "address": {
      "street": "Norberto Crossing",
      "suite": "Apt. 950",
      "city": "South Christy",
      "zipcode": "23505-1337",
      "geo": {
        "lat": "-71.4197",
        "lng": "71.7478"
      }
    },
    "phone": "1-477-935-8478 x6430",
    "website": "ola.org",
    "company": {
      "name": "Considine-Lockman",
      "catchPhrase": "Synchronised bottom-line interface",
      "bs": "e-enable innovative applications"
    }
  },
  {
    "id": 7,
    "name": "Kurtis Weissnat",
    "username": "Elwyn.Skiles",
    "email": "Telly.Hoeger@billy.biz",
    "address": {
      "street": "Rex Trail",
      "suite": "Suite 280",
      "city": "Howemouth",
      "zipcode": "58804-1099",
      "geo": {
        "lat": "24.8918",
        "lng": "21.8984"
      }
    },
    "phone": "210.067.6132",
    "website": "elvis.io",
    "company": {
      "name": "Johns Group",
      "catchPhrase": "Configurable multimedia task-force",
      "bs": "generate enterprise e-tailers"
    }
  },
  {
    "id": 8,
    "name": "Nicholas Runolfsdottir V",
    "username": "Maxime_Nienow",
    "email": "Sherwood@rosamond.me",
    "address": {
      "street": "Ellsworth Summit",
      "suite": "Suite 729",
      "city": "Aliyaview",
      "zipcode": "45169",
      "geo": {
        "lat": "-14.3990",
        "lng": "-120.7677"
      }
    },
    "phone": "586.493.6943 x140",
    "website": "jacynthe.com",
    "company": {
      "name": "Abernathy Group",
      "catchPhrase": "Implemented secondary concept",
      "bs": "e-enable extensible e-tailers"
    }
  },
  {
    "id": 9,
    "name": "Glenna Reichert",
    "username": "Delphine",
    "email": "Chaim_McDermott@dana.io",
    "address": {
      "street": "Dayna Park",
      "suite": "Suite 449",
      "city": "Bartholomebury",
      "zipcode": "76495-3109",
      "geo": {
        "lat": "24.6463",
        "lng": "-168.8889"
      }
    },
    "phone": "(775)976-6794 x41206",
    "website": "conrad.com",
    "company": {
      "name": "Yost and Sons",
      "catchPhrase": "Switchable contextually-based project",
      "bs": "aggregate real-time technologies"
    }
  },
  {
    "id": 10,
    "name": "Clementina DuBuque",
    "username": "Moriah.Stanton",
    "email": "Rey.Padberg@karina.biz",
    "address": {
      "street": "Kattie Turnpike",
      "suite": "Suite 198",
      "city": "Lebsackbury",
      "zipcode": "31428-2261",
      "geo": {
        "lat": "-38.2386",
        "lng": "57.2232"
      }
    },
    "phone": "024-648-3804",
    "website": "ambrose.net",
    "company": {
      "name": "Hoeger LLC",
      "catchPhrase": "Centralized empowering task-force",
      "bs": "target end-to-end models"
    }
  }
]
```

### Responses

|HTTP Status Code |Meaning|Description|Data schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Sample employee details|Inline|

### Responses Data Schema

HTTP Status Code **200**

|Name|Type|Required|Restrictions|Title|description|
|---|---|---|---|---|---|
|» id|integer|true|none||none|
|» name|string|true|none||none|
|» username|string|true|none||none|
|» email|string|true|none||none|
|» address|object|true|none||none|
|»» street|string|true|none||none|
|»» suite|string|true|none||none|
|»» city|string|true|none||none|
|»» zipcode|string|true|none||none|
|»» geo|object|true|none||none|
|»»» lat|string|true|none||none|
|»»» lng|string|true|none||none|
|» phone|string|true|none||none|
|» website|string|true|none||none|
|» company|object|true|none||none|
|»» name|string|true|none||none|
|»» catchPhrase|string|true|none||none|
|»» bs|string|true|none||none|

# Data Schema

