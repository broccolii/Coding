#!/usr/bin/env python 
import os
import urllib
import urllib2

try:
    response = urllib2.urlopen('https://giphy.com/search/cat') 
    print 'response headers: "%s"' % response.info()
except IOError, e:
    if hasattr(e, 'code'): # HTTPError
        print 'http error code: ', e.code
    elif hasattr(e, 'reason'): # URLError
        print "can't connect, reason: ", e.reason
    else:
        raise