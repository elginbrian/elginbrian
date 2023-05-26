import pygame as pg

# init
pg.init()

# create window
window = pg.display.set_mode((500,500))

# game object
x = 250
y = 250
length = 20
width = 20
speed = 0.1

isRun = True
while isRun:
    # user input / database input
    for event in pg.event.get():
        if event.type == pg.QUIT:
            isRun = False

    # keyboard input
    keys = pg.key.get_pressed()
    if keys[pg.K_LEFT] and x > 0 :
        x -= speed
    if keys[pg.K_RIGHT] and x < 500 - width:
        x += speed
    if keys[pg.K_UP] and y > 0 :
        y -= speed
    if keys[pg.K_DOWN] and y < 500 - length:
        y += speed

    # update assets
    window.fill((255,255,255))
    pg.draw.rect(window, (255,0,0),(x,y,length,width))

    # render
    pg.display.update()

pg.quit()
