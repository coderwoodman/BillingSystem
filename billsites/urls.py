from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()
from billsites.views import hello

urlpatterns = patterns('',
    # Examples:
    # url(r'^$', 'billsites.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),

    url(r'^$', hello),
    url(r'^admin/$', include(admin.site.urls)),
    url(r'^hello/$', hello),
)
