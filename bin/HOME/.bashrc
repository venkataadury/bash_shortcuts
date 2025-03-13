# ~/.bashrc: executed by bash(1) for non-login shells.
# see /usr/share/doc/bash/examples/startup-files (in the package bash-doc)
# for examples
# If not running interactively, don't do anything
[ -z "$PS1" ] && return

# don't put duplicate lines in the history. See bash(1) for more options
# ... or force ignoredups and ignorespace
HISTCONTROL=ignoredups:ignorespace

# append to the history file, don't overwrite it
shopt -s histappend

# for setting history length see HISTSIZE and HISTFILESIZE in bash(1)
HISTSIZE=1000
HISTFILESIZE=2000

# check the window size after each command and, if necessary,
# update the values of LINES and COLUMNS.
shopt -s checkwinsize

# make less more friendly for non-text input files, see lesspipe(1)
[ -x /usr/bin/lesspipe ] && eval "$(SHELL=/bin/sh lesspipe)"

# set variable identifying the chroot you work in (used in the prompt below)
if [ -z "$debian_chroot" ] && [ -r /etc/debian_chroot ]; then
    debian_chroot=$(cat /etc/debian_chroot)
fi

# set a fancy prompt (non-color, unless we know we "want" color)
case "$TERM" in
    xterm-color) color_prompt=yes;;
esac

# uncomment for a colored prompt, if the terminal has the capability; turned
# off by default to not distract the user: the focus in a terminal window
# should be on the output of commands, not on the prompt
#force_color_prompt=yes

if [ -n "$force_color_prompt" ]; then
    if [ -x /usr/bin/tput ] && tput setaf 1 >&/dev/null; then
	# We have color support; assume it's compliant with Ecma-48
	# (ISO/IEC-6429). (Lack of such support is extremely rare, and such
	# a case would tend to support setf rather than setaf.)
	color_prompt=yes
    else
	color_prompt=
    fi
fi

if [ "$color_prompt" = yes ]; then
    PS1='${debian_chroot:+($debian_chroot)}\[\033[01;32m\]\u@\h\[\033[00m\]:\[\033[01;34m\]\w\[\033[00m\]\$ '
else
    PS1='${debian_chroot:+($debian_chroot)}\u@\h:\w\$ '
fi
unset color_prompt force_color_prompt

# If this is an xterm set the title to user@host:dir
case "$TERM" in
xterm*|rxvt*)
    PS1="\[\e]0;${debian_chroot:+($debian_chroot)}\u@\h: \w\a\]$PS1"
    ;;
*)
    ;;
esac

# enable color support of ls and also add handy aliases
if [ -x /usr/bin/dircolors ]; then
    test -r ~/.dircolors && eval "$(dircolors -b ~/.dircolors)" || eval "$(dircolors -b)"
    alias ls='ls --color=auto'
    alias dir='dir --color=auto'
    alias vdir='vdir --color=auto'

    alias grep='grep --color=auto'
    alias fgrep='fgrep --color=auto'
    alias egrep='egrep --color=auto'
fi

# some more ls aliases
alias ll='ls -alF'
alias la='ls -A'
alias l='ls -CF'
alias exho='echo'
alias eco='echo'
# Add an "alert" alias for long running commands.  Use like so:
#   sleep 10; alert
alias alert='notify-send --urgency=low -i "$([ $? = 0 ] && echo terminal || echo error)" "$(history|tail -n1|sed -e '\''s/^\s*[0-9]\+\s*//;s/[;&|]\s*alert$//'\'')"'

# Alias definitions.
# You may want to put all your additions into a separate file like
# ~/.bash_aliases, instead of adding them here directly.
# See /usr/share/doc/bash-doc/examples in the bash-doc package.

if [ -f ~/.bash_aliases ]; then
    . ~/.bash_aliases
fi

# enable programmable completion features (you don't need to enable
# this, if it's already enabled in /etc/bash.bashrc and /etc/profile
# sources /etc/bash.bashrc).
if [ -f /etc/bash_completion ] && ! shopt -oq posix; then
    . /etc/bash_completion
fi
PATH=$PATH":$HOME:$HOME/Desktop:$HOME/Desktop/mykde/kde:/:$HOME/bin:$HOME/bin:/usr/games:/bin/ml:/bin/math"
MANPATH="/home/venkata/site/man:/home/venkata/man"
#aliases
DUMP="1> /dev/null 2> /dev/null"
alias ld='ls --color=auto -tr'
alias chdir='cd'
alias exir='exit'
alias ext='exit'
alias ls='ls --color=auto --group-directories-first'
alias "ls-al"='ls --color=auto'
alias lc='ls --color=auto -C'
PATH=$PATH":/usr/sbin"
alias say='echo'
alias die='exit'
alias chomp='read'
alias d='. .cd'
alias sys='sudo'
alias end='sudo shutdown -P now'
alias pend='pkill'
alias sysout='pkill -u $USER'
alias err='exit'
alias term='exit'
alias sysq='exit'
alias quit='exit'
alias del='rm'
alias act='.act'
alias rb='sudo reboot -f'
alias andy='ardentryst'
alias md='mkdir -p'
alias q='man'
alias me="$USER"
alias install='sudo apt-get install'
alias remove='sudo apt-get remove'
alias purge='sudo apt-get --purge remove'
alias reload='sudo apt-get update'
alias update='sudo apt-get update'
alias upgrade='sudo apt-get upgrade'
alias S='sudo'
alias perm='chmod'
alias ro='chmod 400'
alias rw='chmod 700'
alias reg='chmod 745'
alias 775='chmod 775'
alias 745='chmod 745'
alias 400='chmod 400'
alias 777='chmod 777'
alias mf='echo "" >'
alias mkfl='echo "" >'
alias reinstall='sudo apt-get install --reinstall'
alias rd='rm -r'
alias fm='nautilus --no-desktop .'
alias lgo="pkill -u $USER"
alias बंद='exit'
alias ोबोल='echo'
alias unlock='chmod 775 /home/venkata/sh/devel'
alias autoremove='sudo apt-get autoremove'
alias install-f='sudo apt-get install -f'
alias battle='cd /usr/share/games/wesnoth/1.12'
alias cd..='cd ..'
alias pass=''
alias path.add='. /bin/pathset add'
alias path.del='. /bin/pathset del'
alias noth='cd $HOME/.local/share/wesnoth/1.10/data'
alias rspath="PATH='/bin:/usr/bin:$HOME'"
alias '?'="man "
alias exs='echo $?'
alias K="pkill -kill"
alias now="time.now"
alias man="~/.manual"
alias gromacs='gmx_2020'
path.add /bin/chem
path.add /bin/string
path.add /bin/xml
path.add /opt/ambertools/bin
export PYTHONPATH="/home/venkata/Desktop/wxPython-src-2.9.4.0/wxPython+:/home/venkata/python/dev"
MODE=""
read -p "Run in amber mode? (y/n)" yna
if [ "$yna" = y ]; then
	export LD_LIBRARY_PATH="$LD_LIBRARY_PATH"":/usr/lib/gcc/x86_64-pc-linux-gnu/7.4.1:/opt/ambertools/lib:/home/venkata/Desktop/wxPython-src-2.9.4.0/bld/lib"
	path.add "$HOME/MD/amber/python"
	MODE=$MODE+"AMBER "
else
	export LD_LIBRARY_PATH="$LD_LIBRARY_PATH"":/home/venkata/Desktop/wxPython-src-2.9.4.0/bld/lib"
fi
#        python2.7 /usr/local/lib/python2.7/dist-packages/*/vidle/idle.py
export SDL_MOUSE_RELATIVE=0
alias null='tput setaf 9'
alias "coat"='chmod 000'
alias fix='tput setaf 9; setterm -bold off'
alias bin='rm'
alias today='date +%d/%m/%Y'
alias '..'='cd ..'
alias 'jaav'='java'
alias 'startsql'="mysql --user=root --password=sairam"
alias javac='javac -encoding "UTF-8"'
alias python='python3'
VEN="/home/venkata"
PI="22/7"
alias pkill='.kproc'
txmsg=$USER"@"`uname -a|cut -d" " -f2`":"`pwd|sed s/"\/home\/venkata"/"~"/`"$ "
WESPATH="/usr/share/games/wesnoth/1.12/data/core"
alias commons="cd $HOME/Depjava/UPTODATE/commons"
alias maths="cd $HOME/Depjava/UPTODATE/maths"
alias draw="cd $HOME/Depjava/UPTODATE/draw"
alias chem="cd $HOME/Depjava/UPTODATE/chem"
alias jdir="cd $HOME/Depjava/UPTODATE"
alias cgrap="g++ -lGL -lGLU -lglut -nostartfiles "
alias sfmlc="g++ -lsfml-graphics -lsfml-window -lsfml-system"
alias todo=".todo.py"
alias plumed-standalone="plumed --no-mpi"

todo
#Run interactive terminal
if test -z "$lock"
then
read -p "Run interactive terminal? (y/n)" yn
if [ "$yn" = y ]; then
	MODE=$MODE+"INTERACTIVE"
	. ~/.iterm
fi
fi
if test `alias|grep cd=|wc -l` -eq 1; then unalias cd; fi
function cdd()
{
x="$*"
echo $x
if test -d "$x"
then
cd "$x"
ls
return 0
elif test -f "$x"
then
	return 1
else
echo "No such file or directory."
return 1
fi
}

alias cd='. .cd'
complete -r cd
alias vi="vim"
alias tfg++='g++ -std=c++17 -I ~/lib/tensorflow/include -I ~/lib/tensorflow/cppflow/include/ -ltensorflow'

_plumed() { eval "$(plumed --no-mpi completion 2>/dev/null)";}
complete -F _plumed -o default plumed

function katee()
{
x="$*"
echo $x
if test -d "$x"
then
echo "Target is a folder"
return
elif test -f "$x"
then
/usr/bin/kate "$x"
else
touch "$x"
y=`echo "$x"|cut -d'.' -f2`
y2=`echo "$x"|cut -d'.' -f1`
A=$(dirname "$x")
if [[ "$A" == "." ]]; then
A=`pwd`
fi
if [[ "$y" == "java" ]]; then #Second
echo "package "$A > "$x"
echo >> "$x"
z=$(basename "$y2")
echo "public class "$z >> "$x"
fi #Second
/usr/bin/kate "$x"
fi #First
}

if test -z "$BRIGHTNESS"
then
	export BRIGHTNESS=1
fi

export LD_LIBRARY_PATH=$LD_LIBRARY_PATH":/home/venkata/plumed2.6/lib"
PATH="/home/venkata/perl5/bin${PATH:+:${PATH}}"; export PATH;
PERL5LIB="/home/venkata/perl5/lib/perl5${PERL5LIB:+:${PERL5LIB}}"; export PERL5LIB;
PERL_LOCAL_LIB_ROOT="/home/venkata/perl5${PERL_LOCAL_LIB_ROOT:+:${PERL_LOCAL_LIB_ROOT}}"; export PERL_LOCAL_LIB_ROOT;
PERL_MB_OPT="--install_base \"/home/venkata/perl5\""; export PERL_MB_OPT;
PERL_MM_OPT="INSTALL_BASE=/home/venkata/perl5"; export PERL_MM_OPT;
path.add /home/venkata/dnv/bin
export DNV_ROOT='/home/venkata/dnv'
export LIBRARY_PATH=$LIBRARY_PATH:"$HOME/lib/tensorflow/lib"
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:"$HOME/lib/tensorflow/lib"

# >>> conda initialize >>>
# !! Contents within this block are managed by 'conda init' !!
__conda_setup="$('/opt/conda/bin/conda' 'shell.bash' 'hook' 2> /dev/null)"
if [ $? -eq 0 ]; then
    eval "$__conda_setup"
else
    if [ -f "/opt/conda/etc/profile.d/conda.sh" ]; then
        . "/opt/conda/etc/profile.d/conda.sh"
    else
        export PATH="/opt/conda/bin:$PATH"
    fi
fi
unset __conda_setup
# <<< conda initialize <<<

eval `ssh-agent -s`
ssh-add ~/.ssh/key_ssh
